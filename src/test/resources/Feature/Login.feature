Feature: yo como usuario de netflix deseo ingresar con credenciales correctas e imprimir titulo
Scenario: Login exitoso en netflix
  Given navego a plataforma netflix
  When ingreso las credenciales 'maleja94.02@hotmail.com', 'Mapm2023'
  Then valido login exitoso e imprimo titulo





