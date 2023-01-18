#language:es
@DEMO
Característica: Prueba de concepto SpringBoot + Cucumber - DEMOQA

 # @DEMO_ELEMENT
  #Escenario: caso1-Busqueda en google
   # Dado que abro la pagina de google
    #Cuando escribo la busqueda de: "cantantes de rock"
    #Entonces valido que los resultados sean mayores a 0

   @DEMO_ELEMENT
  Escenario: caso1-Busqueda en google
    Dado que abro la pagina demoqa
    Cuando selecciono Yes en Radio button de elements
    Entonces valido que se selecciono "yes"

#@LOGIN_SAUCE
  #Escenario: caso1-Login en SauceDemo
  #Dado que abro la pagina de SauceDemo
  #Cuando escribo el "standard_user" y <secret_sauce>
  #Entonces doy clic en el boton login

  #standard_user ; secret_sauce

  #@CARRO_SAUCE
  #Escenario: caso2-Agregar al carro de compras
  #Dado selecciono producto
  #Cuando doy clic en el boton add cart
  #Entonces valido que figure en carro de compras

    #@COMPRAR_SAUCE.......falta
  #Escenario: caso3-Comprar desde carro de compras
  #Dado selecciono producto
  #Cuando doy clic en el boton add cart
  #Entonces valido que figure en carro de compras
  #@GOOGLE_SETTINGS
  #Escenario: caso2-Configuraciones en google
    #Dado que abro la pagina de configuracio de google
    #Cuando busco la opcion "Usuario"
    #Entonces valido que el resultado sea "Autocompletar"