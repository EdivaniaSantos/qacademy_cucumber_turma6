#language:pt

  @Register
  Funcionalidade: Como usuario do site Register
                  Eu desejo realizar um cadastro
                  Pra validar se foi cadastrado com sucesso

    @Teste01
    Cenário: Validar cadastro com sucesso no site Register
      Dado que eu acesso o site Register
      Quando preencho o campo firstName com o valor "Edivania"
      E preencho o campo lastName com o valor "Pexoto"
      E preencho o campo address com o valor "rua dos alpes"
      E preencho o campo emailAddress com o valor "edivanya.emjy@hotmail.com"
      E preencho o campo phone com o valor "46160625"
      E clico no campo feminino
      E clico no checkbox Male
      E clico no checkbox Movies
      E clico no checkbox java
      E preencho o campo year com o valor "1995",month "April", e o day "22"

