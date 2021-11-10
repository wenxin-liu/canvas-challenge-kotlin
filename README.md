# Canvas challenge
A command line version of a drawing program built using Kotlin.
The program should work as follows:
1. create a new canvas.
2. start drawing on the canvas by issuing various commands. (under development) 
3. quit. (under development)

## Instructions
### Git clone
`git clone git@github.com:wenxin-liu/canvas-challenge-kotlin.git`

`cd canvas-challenge-kotlin`

### Build
`./gradlew build` 

### Run
Requires JDK11

`java -jar app/build/libs/app.jar`

### Commands
`C w h` Should create a new canvas of width w and height h.

e.g.:

```
enter command: C 20 4
---------------------- 
|                    |
|                    |
|                    |
|                    |
----------------------
```

## Considerations
* MVC (Model-View-Controller) design pattern to achieve separation of concerns
* Outside-in TDD approach for practice purposes (as set in the requirements) 
* Edge-cases and error handling:
  * Will accept command in both upper and lowercase. Both `c 20 4` and `C 20 4` are valid.
  * If an invalid command is entered, the user will be prompted to retry until a valid command is entered.
