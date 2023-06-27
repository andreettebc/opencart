Feature: Purchase products at opencart

  @happyPath
 Scenario Outline: Proceso de compra
   #Agregar dos prodcutos al carrito y visualizar el carrito
   Given User estoy en la pagina opencart
   When selecciono un producto del catalogo
   Then agrego el producto al carrito
    And veo el carrito


    #Completar el formulario de compra y finalizarla
    When ingreso datos <first_name> <last_name> <email> <phone> <company> <address> <city> <post_code> <country> <region>
    Then veo nuevo formulario

    Examples:
      | first_name | last_name | email            | phone     | company | address | city  | post_code | country | region |
      | Andrea     | Burgos    | andrea@gmail.com | 123456789 | Casa    | Address | Quito | 4546      |         | Conwy  |




