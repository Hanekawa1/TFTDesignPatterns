# TFTDesignPatterns

* TFT (Team Fight Tatics) é um jogo de tabuleiro e estratégia em turnos que coloca você em batalha todos contra todos para montar um poderoso time onde e composto por varios personagens onde esses personagens possuem atributos, classes e elementos.

## Objetivo

* O objetivo da implementação dos design patterns nesse cenário é simular uma criação de times de batalhas baseado nos campeões escolhidos semelhante ao processo do jogo. Ao analisarmos as características do jogo, vimos que cada campeão tem diversas singularidades, como por exemplo seu elemento e sua classe, tornando assim a criação de um campeão bastante complexa. Outro ponto que analisamos foi a estratégia de composição dos times, onde um time pode optar por ter menos campeões de mesmo elemento ou vários campeões de elementos distintos, sendo assim tratados de mesma forma em sua composição, pois todos são objetos campeões. E uma análise final, decidimos centralizar a maior quantidade de variações(classes e elementos) em fábricas para facilitar no processo de criação.

## Design Patterns

* Factory: Usamos a Factory para centralizar as criações de classes e elementos nas fábricas e facilitar a instanciação desses objetos no builder. Ao invés de adicionarmos uma classe ou elemento via ``` new Classe(); ``` ou ``` new Elemento(); ```, simplesmente passamos o nome da classe ou elemento para o builder e ele cuida da chamada à fábrica, que recebe o nome, instancia o objeto correto e o retorna para o builder.

* Builder: Usamos a Builder, pois com ela setamos os atributos, classes e elementos de cada personagem, provendo assim um melhor controle no processo de construção, representação e alteração de um objeto complexo, evitando assim várias chamadas de ``` setters ```, como ```  objeto.setNome() ```.

* Composite: Usamos o Composite, pois no TFT o time pode ter um ou varios campeões, tratando assim as composições com menos ou com mais campeões de mesma forma. 

## Autores

*  [Gustavo Henrique Dias Silva](https://github.com/GustavoDiias)
*  [Wender Lucas Souza](https://github.com/Miyukii)
