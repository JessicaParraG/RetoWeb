#language: es
Característica: Agregar productos al carrito

  Esquema del escenario: Agregar cinco productos al carrito
    Dado que el usuario ingrese a la pagina del <exito>
    Cuando el agregue cinco productos al carrito
    Entonces validara sus productos en el carrito
    Ejemplos:
      | exito                  |
      | https://www.exito.com/ |