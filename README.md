# Android E02: Activity

Professor: João Eduardo Montandon

## Entendendo melhor o Ciclo de Vida

Durante o período de desenvolvimento, é comum que os desenvolvedores Android observarem de perto como o ciclo de vida das atividades de seus aplicativos. Para isso, eles geralmente criam uma `Activity` genérica -- geralmente denominada `DebugActivity` -- e registram o log de todos os eventos de ciclo de vida descritos na documentação. Isso permite aos desenvolvedores saberem como o Sistema do Android está tratando cada uma de suas atividades.

Você deverá implementar um aplicativo de login. Esse aplicativo conterá duas telas, e ambas deverão herdar a classe `DebugActivity`. A primeira tela deverá representar o formulário de login. Para que o login seja feito corretamente, o usuário deverá passar como credenciais o user `admin` e a senha `admin123`. É importante ressaltar que o campo de senha não pode exibir seu conteúdo como texto normal.

Se o login for feito corretamente, o usuário deverá ser redirecionado para a segunda tela, que irá informá-lo de que o login foi feito corretamente. Caso contrário, um Toast deverá ser exibido informando que o usuário forneceu dados incorretos.

Você deverá entregar, junto do aplicativo, dois arquivos texto contendo o registro de log para as duas situações: (a) login feito corretamente; e (b) Login feito incorretamente.

## Trabalhando com o objeto `bundle`

Altere o aplicativo feito anteriormente de forma que a próxima tela imprima o username do usuário, se ele tiver fornecido as credenciais corretamente.