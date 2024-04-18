package template

import (
	"io"
	"os"
)

type OutputFile struct {
	Content  string
	FileName string
	Dir      string
}

func NewOutputFile(content string, fileName string, dir string) *OutputFile {
	return &OutputFile{
		Content:  content,
		FileName: fileName,
		Dir:      dir,
	}
}

func (o *OutputFile) Generate() error {
	print("Generating file: " + o.FileName + " in " + o.Dir + "\n")
	// create directory if not exists
	err := os.MkdirAll(o.Dir, os.ModePerm)
	if err != nil {
		if !os.IsExist(err) {
			return nil
		}
	}
	file, err := os.Create(o.Dir + "/" + o.FileName)
	if err != nil {
		return err
	}
	defer file.Close()

	_, err = io.WriteString(file, o.Content)
	if err != nil {
		return err
	}
	return nil
}
