# COMP1531 (Software Engineering Fundamentals)

Welcome to the resources for COMP1531 23T3.

You can find the code it's week's folder, and the slides from the links below.

| Week            | Topics                               | Slides                                      |
| --------------- | ------------------------------------ | ------------------------------------------- |
| [01](./week01/) | JavaScript, Git                      | [PDF](./week01/COMP1531%20-%20Week%201.pdf) |
| [02](./week02/) | Code Style, Further JavaScript + Git | [PDF](./week02/COMP1531%20-%20Week%202.pdf) |
| [03](./week03/) | NPM, Testing, Multi-files            | [PDF](./week03/COMP1531%20-%20Week%203.pdf) |
| [04](./week04/) | Agile, Typing, Linting + Code Review | [PDF](./week04/COMP1531%20-%20Week%204.pdf) |
| [05](./week05/) | Express, HTTP, Functions             | [PDF](./week05/Week%205%20COMP1531.pdf)     |
| 07              | DRY, KISS, Exceptions, Routes        |

## Miscellaneous

- [Anonymous Feedback Form](https://forms.gle/BytrFSG3vMzU73HW9)
- [Git Setup + Basics Guide](https://gist.github.com/jeremyle56/f3b664f0491d6ec0d9a03ab34780b876)
- [Course Tutorial Solutions](https://nw-syd-gitlab.cseunsw.tech/COMP1531/23T3/tutorials/-/tree/master)

### Local Setup

I would highly recommend all students in this course setup a local development environment. All submissions for this course are done through GitLab so there is no need to code on CSE machines.

#### For Windows / UNIX

If you are on Windows you should install and use WSL which you can do by following [this](https://github.com/WilliamHuynh5/unsw-cse-home-computing-wsl2) guide written by a fellow COMP1531 tutor. This will allow you to have a UNIX environment which will make development easier. Skip this if you already have a UNIX environment.

Then run the following commands in the terminal:

```shell
sudo apt update && sudo apt upgrade
sudo apt install git
```

#### For MacOS

If you are on MacOS you will need to install [Homebrew](https://brew.sh/), a package manager.

```shell
brew install git
```

#### Install Node

You will want to install node by installing NVM which can be done [here](https://github.com/nvm-sh/nvm#installing-and-updating).

Once NVM is installed you can install Node and NPM by following the instructions [here](https://github.com/nvm-sh/nvm#installing-and-updating). NVM allows you to control the node version you are using so you can match CSE's version.
