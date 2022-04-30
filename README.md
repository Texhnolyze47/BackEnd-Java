# BackEnd JAVA

BackEnd Java es un conjunto de ejercicios relacionados a los conceptos básicos
de la programación orienta a objetos.

### Tabla de contenido

- [Ejercicio 1](https://github.com/Texhnolyze47/BackEnd-Java#ejercicio-1-pr%C3%A1ctica-modelado)
- [Ejercicio 2](https://github.com/Texhnolyze47/BackEnd-Java#ejercicio-2-pr%C3%A1ctica-herencia-y-polimorfismo)
- [Ejercicio 3](https://github.com/Texhnolyze47/BackEnd-Java#ejercicio-3-pr%C3%A1ctica-interfaces)
- [Ejercicio 4](https://github.com/Texhnolyze47/BackEnd-Java#ejercicio-4-pr%C3%A1ctica-hilos)



## Ejercicio 1: Práctica Modelado
En esta practica simplemente se debe modelar 5 personajes de la saga harry potter.

#### Clase principal:

- [TestPersonaje](src/practicaHarry/TestPersonaje.java):

Esta clase se contiene el metodo `main` ademas de tener metodos para cada probar los clases.

#### Clases:

- [Draco Malfoy](src/practicaHarry/DracoMalfoy.java)

- [Harry Potter](src/practicaHarry/HarryPotter.java)

- [RonaldWeasley](src/practicaHarry/RonaldWeasley.java)

- [Serverus Snape](src/practicaHarry/ServerusSnape.java)

- [Tom Riddle](src/practicaHarry/TomRiddle.java)

### Diagrama
![Diagrama del ejercicio](src/practicaHarry/diagrama/BackEnd-ejercicio1.jpg)

### Ejecución
![Ejecucion del programa](src/practicaHarry/ejecucion/img.png)
![Ejecucion del programa](src/practicaHarry/ejecucion/img_1.png)


## Ejercicio 2: Práctica Herencia y Polimorfismo

En esta practica deberas modelar al menos 6 versiones de la mascota de github octoCat, en esta practica se debera utilizar
los concepto de herencia y polimorfismo.


#### Clase principal:

- [TestOctoCat](src/practicaMona/TestOctoCat)

Esta clase se contiene el metodo `main` ademas de tener metodos para cada probar los clases.

#### Clases:

Esta son las clases hijas son las clases que heredaran los atributos de la clase padre.
- [ChelloCat](src/practicaMona/ChelloCat.java)
- [ClassCat](src/practicaMona/ClassCat.java)
- [InspectoCat](src/practicaMona/InspectoCat.java)
- [OctobiWan](src/practicaMona/OctobiWan)

Esta es la clase padre, esto quiere decir que hereda tanto sus atributos como sus metodos

- [OctoCat](src/practicaMona/OctoCat.java)


### Ejecución
![Ejecucion del programa](src/practicaMona/ejecucion/img.png)

### Diagrama
![Diagrama del ejercicio](src/practicaMona/diagrama/BackEnd-ejercicio2.jpg)

## Ejercicio 3: Práctica Interfaces
En esta practica debes modelar el objeto spiderman y elegir a 3 personajes que herenden de Spiderman, estos ultimos deberan tener
sus propias intefaces.

#### Clase principal:

- [TestSpiderman](src/practicaMultiverse/TestSpiderman.java):

 Esta clase se contiene el metodo `main` ademas de tener metodos para cada probar los clases.

#### Clases:
Esta son las clases hijas son las clases que heredaran los atributos de la clase padre.
- [SPdr](src/practicaMultiverse/SPdr.java)
- [SpiderManNoir](src/practicaMultiverse/SpiderManNoir.java)
- [SpiderManMilesMorales](src/practicaMultiverse/SpiderManMilesMorales.java)

Esta es la clase padre, esto quiere decir que hereda tanto sus atributos como sus metodos
- [Spiderman](src/practicaMultiverse/Spiderman.java)

### Diagrama
![Ejecucion del programa](src/practicaMultiverse/diagrama/BackEnd-ejercicio3.png)

### Ejecución
![Ejecucion del programa](src/practicaMultiverse/ejecucion/ejecucion.gif)

 ## Ejercicio 4: Práctica Hilos
 En esta practica crear un comic inspirandote en alguno que te guste, aqui modelar, las clases, interfaces e hilos para
 contar una pequeña historia.

#### Clase principal:

- [ComicTest](src/practicaComics/ComicsTest.java)

 Esta clase se contiene el metodo `main` ademas de tener metodos para cada probar los clases.


#### Clases:
Esta son las clases hijas son las clases que heredaran los atributos de la clase padre.

- [Pagina 1](src/practicaComics/Pagina1.java)
- [Pagina 2](src/practicaComics/Pagina2.java)
- [Pagina 3](src/practicaComics/Pagina3.java)
- [Pagina 4](src/practicaComics/Pagina4.java)
- [Pagina 5](src/practicaComics/Pagina5.java)
- [Pagina 6](src/practicaComics/Pagina6.java)

Esta es la clase padre, esto quiere decir que hereda tanto sus atributos como sus metodos

- [Comic](src/practicaComics/Comic.java)


 ### Diagrama
 ![Ejecucion del programa](src/practicaComic/diagrama/BackEnd-ejercicio4.png)

### Ejecución
![Ejecucion del programa](src/practicaComic/ejecucion/ejecucion.gif)