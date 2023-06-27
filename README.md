
# Evaluacion  E2E

Arquetipo de pruebas automatizadas E2E usando la herramienta SerenityBDD con Screenplay

Realizadas por: Andrea Burgos

## Pre-requisitos
|   Intellij   |    Java    |   Gradle   |
| :----------: | :--------: | :--------: |
| [![Intellij](https://cdn.iconscout.com/icon/free/png-128/intellij-idea-569199.png)](https://www.jetbrains.com/es-es/idea/download/#section=windows) | [![Java](https://www.oracle.com/a/ocom/img/cb71-java-logo.png)](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) | [![Gradle](https://gradle.org/images/gradle-knowledge-graph-logo.png?20170228)](https://gradle.org/releases/) |

> **NOTA**:
> * Una vez obtenido Intellij es necesario instalar los plugins de Gherkin y Cucumber. ([Guía de instalación de plugins en IntelliJ](https://www.jetbrains.com/help/idea/managing-plugins.html))
> * El navegador usado para la ejecución de las pruebas fue Google Chrome en su última versión (98.0.4758.102)

## Ejecución local

Para ejecutar el escenario:

Dirijase al path :
```bash
src\test\java\runners\
```
En el archivo **RunnerTest** Presionar Click derecho y ejecutar la opcion > Run 'RunnerTest'


## Reporte
Luego de la ejecución, para abrir el reporte dirigirse abrir el archivo **index.html** que se encuentra en el siguiente path:
```bash
serenity-e2e\target\build\reports/index.html
```

> **NOTA**:
> * Para ejecutar el proyecto se necesita Java JDK 11 y Gradle con la versión 7.6 o superior.
> * Para poder instalar gradle en windows podemos seguir el siguiente tutorial https://www.geeksforgeeks.org/how-to-install-gradle-on-windows/.
> * Luego de la ejecucion de pruebas, los reportes se generan en la carpeta **build/karate-reports/**, y el archivo de resumen es el **karate-summary.html**

## Construido con:
La automatización fue desarrollada con:

* BDD - Estrategia de desarrollo
* Gradle - Manejador de dependencias
* Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Documentacion

[Serenity BDD](https://github.com/serenity-bdd/serenity-documentation)
