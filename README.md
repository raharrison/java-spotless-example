- Automatic code formatting / whitespace
- Not just Java - Kotlin, Groovy, JS/TS, Python, JSON etc
- Remote unused imports
- Add license header
- Optional linting fixes
- Apply only to changed files (via git)

Can run as part of the build process in PR's so developers don't have to worry about it.
Doesn't just fail the build if formatting is incorrect, will apply the changes on top automatically

```shell
user@machine repo % ./gradlew build
:spotlessJavaCheck FAILED
  The following files had format violations:
  src\main\java\com\diffplug\gradle\spotless\FormatExtension.java
    -\t\t····if·(targets.length·==·0)·{
    +\t\tif·(targets.length·==·0)·{
  Run './gradlew spotlessApply' to fix these violations.
user@machine repo % ./gradlew spotlessApply
:spotlessApply
BUILD SUCCESSFUL
user@machine repo % ./gradlew build
BUILD SUCCESSFUL
```