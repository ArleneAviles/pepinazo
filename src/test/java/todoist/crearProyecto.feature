Feature: creacion de proyecto de diferentes maneras

  Scenario:  Crear un nuevo projecto con signo +
    Given Yo ingrese a la aplicacion de todoist
    When Agrego un proyecto nuevo desde "icono +"
    Then El nuevo proyecto debe estar listado al final

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