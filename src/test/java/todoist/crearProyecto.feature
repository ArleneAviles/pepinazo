Feature: creacion de proyecto de diferentes maneras

  Scenario Outline:  Crear un nuevo projecto con signo +
    //Given Yo ingrese a la aplicacion de todoist con las credenciales jomarnavarro@gmail.com y Test@1234
    Given hice login con con <user> y <password>
    When Agrego un proyecto nuevo desde "icono +"
    Then El nuevo proyecto debe estar listado al final

    Examples:
      | user                   | password1 |
      | jomarnavarro@gmail.com | Test@1234 |

  Scenario:  Crear un nuevo proyecto con Add Project
    Given Yo ingrese a la aplicacion de todoist
    When Agrego un proyecto nuevo desde "liga New Project"
    Then El nuevo proyecto debe estar listado al final

#  Scenario:  Crear un nuevo proyecto con Add Project Above
#    Given Yo ingrese a la aplicacion de todoist
#    When Agrego un proyecto nuevo desde "Create Project Above"
#    Then El nuevo proyecto debe estar listado al final

#  Scenario:  Crear un nuevo proyecto con Add Project Below

#  Scenario:  Crear un nuevo proyecto desde task
  
  Scenario: X
    Given I have 5 marbles
    When I give away 3
    Then I have 2 marbles left
