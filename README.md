## Algorithmic problems
This repo contains solutions and their tests for algorithmic problems from http://leetcode.com

#### Git hooks
* `pre-commit` - runs gradle test task before commit, to skip the tests, run with the `--no-verify` argument

#### Custom gradle tasks
* `installGitHooks` - copy pre-commit hook to .git/hooks directory.
  
#### Versions
* Java 1.8+
* Gradle 3.4+