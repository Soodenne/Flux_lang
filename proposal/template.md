## Proposal Code: FP_100
### Feature Proposal: [Feature Name]
### Proposal Type: Feature | Enhancement | Bug Fix | Other

---

**Problem Statement:**
* What specific problem or shortcoming does this feature address?
* How would this improve the experience for Flux users?

**Proposed Solution:**
* Describe the new functionality in detail.
* Provide code examples to illustrate how it would work and be used in Flux programs.

**Syntax Suggestions:**
* How would the new feature fit into Flux's existing syntax? 
* Are there new keywords, operators, or structures to consider?

**Alternative Solutions:**
* Are there existing ways to work around this problem in Flux? If so, what are the limitations of these workarounds?

**Additional Considerations:**
* Are there potential side effects or impacts on existing Flux code to be aware of?
* Any other notes, concerns, or open questions about the feature.

**Example:**

```markdown
## Feature Proposal: Conditional Loop

**Problem Statement:**
* Flux currently relies on traditional loops (for, while), which can sometimes lead to verbose code for conditional iterations.

**Proposed Solution:** 
* Introduce a `until` loop that continues iterating until a specified condition is met.

**Syntax Suggestions:**
```flux
until <condition> {
   // Code to be executed
}
