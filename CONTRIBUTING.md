# Contributing Guidelines

## Commit Message Convention

We follow the [Conventional Commits](https://www.conventionalcommits.org/) specification for our commit messages. This leads to more readable messages that are easy to follow when looking through the project history.

### Commit Message Format
Each commit message consists of a **header**, a **body** and a **footer**. The header has a special format that includes a **type**, a **scope** and a **subject**:

```
<type>(<scope>): <subject>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>
```

The **header** is mandatory and the **scope** of the header is optional.

#### Type
Must be one of the following:

* **feat**: A new feature
* **fix**: A bug fix
* **docs**: Documentation only changes
* **style**: Changes that do not affect the meaning of the code (white-space, formatting, etc)
* **refactor**: A code change that neither fixes a bug nor adds a feature
* **perf**: A code change that improves performance
* **test**: Adding missing tests or correcting existing tests
* **build**: Changes that affect the build system or external dependencies
* **ci**: Changes to our CI configuration files and scripts
* **chore**: Other changes that don't modify src or test files
* **revert**: Reverts a previous commit

#### Scope
The scope should be the name of the module affected (as perceived by the person reading the changelog generated from commit messages).

#### Subject
The subject contains a succinct description of the change:

* use the imperative, present tense: "change" not "changed" nor "changes"
* don't capitalize the first letter
* no dot (.) at the end

#### Body
Just as in the **subject**, use the imperative, present tense. The body should include the motivation for the change and contrast this with previous behavior.

#### Footer
The footer should contain any information about **Breaking Changes** and is also the place to reference GitHub issues that this commit **Closes**.

### Examples

```
feat(parser): add ability to parse arrays

Added new ArrayParser class that can handle parsing of array literals.
This enables support for array syntax in our configuration files.

Closes #123
```

```
fix(compiler): resolve crash when using spread operator

The compiler would crash when the spread operator was used in certain contexts.
This fix ensures proper handling of spread operations in all cases.

Fixes #456
```

```
docs(readme): update installation instructions

Updated the README with more detailed installation steps and troubleshooting guide.
```

```
style(formatter): apply consistent indentation

Applied consistent 2-space indentation across all TypeScript files.
```

### Revert commits
If the commit reverts a previous commit, it should begin with `revert:`, followed by the header of the reverted commit. In the body, it should say: `This reverts commit <hash>.`, where the hash is the SHA of the commit being reverted.

### Breaking Changes
Breaking changes must be indicated at the beginning of the footer or body section of the commit message. A breaking change must consist of the uppercase text BREAKING CHANGE, followed by a colon and a space.

```
feat(api): remove deprecated endpoints

BREAKING CHANGE: The following endpoints have been removed:
- /api/v1/users/legacy
- /api/v1/groups/legacy

These endpoints were deprecated in v2.0.0 and have been replaced with:
- /api/v2/users
- /api/v2/groups
```

## Pull Request Process

1. Update the README.md with details of changes if applicable
2. Follow the commit message convention for all commits in the PR
3. Ensure all tests pass and add new tests for new features
4. The PR will be merged once you have the sign-off of at least one maintainer

## Branch Naming Convention

* Feature branches: `feature/<description>`
* Bug fix branches: `fix/<description>`
* Documentation branches: `docs/<description>`
* Release branches: `release/v<version>`

## Code Review Process

* All contributions require review
* Reviewers should focus on:
  * Functionality
  * Code style
  * Test coverage
  * Commit message format
  * Documentation 