#language: pt
#Author: adrialexsouza@gmail.com

@executa
Funcionalidade: Validar formulario
  Eu como aluno quero enviar o formulario para enviar uma mensagem

  @executa1
  Cenario: Enviar formulario
    Dado Que eu esteja no formulario
    Quando Eu preencher e enviar o formulario 
    Entao Sou direcionado para o site da escola
  

  