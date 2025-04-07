# Aphuniu

História

Como gerente de captação de alunos da Faculdade Aphonsiano, preciso de um sistema
que me permita gerenciar os leads interessados em nossos cursos, desde o primeiro contato
até a matrícula, para que possamos otimizar nosso funil de vendas, aumentar a taxa de
conversão e personalizar o atendimento aos potenciais alunos.
A Faculdade Aphonsiano está buscando otimizar o gerenciamento de seus leads e funil
de vendas para aumentar a taxa de conversão e melhorar a comunicação entre os times de
marketing e vendas. Atualmente, o processo é manual e desorganizado, dificultando o
acompanhamento do status de cada lead e tornando o processo mais propenso a erros.
Maria, como coordenadora de marketing, precisa de uma maneira eficiente para
organizar e gerenciar os leads que estão sendo gerados através das campanhas da faculdade.
Ela enfrenta dificuldades para manter o controle de onde cada lead está no processo de
vendas, quais leads têm maior potencial de conversão e quais estão sendo negligenciados.
Isso afeta a eficiência da equipe de vendas, que tem dificuldade em priorizar leads e
personalizar o atendimento.
A solução proposta é o desenvolvimento do sistema Aphuniu (Áfuniu), um sistema de
gestão de leads e funil de vendas. O sistema será executado em console e permitirá que os
dados dos leads e das etapas do funil de vendas sejam salvos em arquivos CSV, carregados
em memória ao iniciar a aplicação e atualizados conforme alterações nos dados. Isso ajudará
Maria e sua equipe a gerenciar os leads de maneira organizada, priorizando-os com base no
score e nas informações coletadas.
Requisitos
Requisitos Funcionais
    1. Cadastro de Leads
O sistema permitirá o cadastro de novos leads com as seguintes informações:
○ ID (gerado automaticamente)
○ Nome
○ Email
○ Telefone
○ Escolaridade (Básica, Fundamental, Graduado, Especialista, Mestre, Doutor)
○ Profissão
○ Empresa em que trabalha
○ Origem do lead (campanha de marketing, indicação, site, rede social, outros)
○ Data e hora do cadastro (YYYY-MM-DD hh:mm:ss)
    2. Gerenciamento de Funil de Vendas
O sistema irá controlar a etapa de cada lead no funil de vendas, permitindo a
atualização da etapa de cada lead com base no progresso do processo:
○ ID do lead
○ Etapa (Descoberta, Consideração, Decisão) *Obs sublinhados estão os valores
padrão.
○ Temperatura do lead (Frio, Quente)
○ Classificação (MQL, SQL, PQL, Descartado, Convertido)
○ Score (com base nos critérios: viabilidade, necessidade, orçamento, perfil,
autoridade e timing) padrão 0.
○ Data e hora do último contato (YYYY-MM-DD hh:mm:ss)
○ Descrição do contato (resumo das interações com o lead)
    3. Armazenamento em Arquivo CSV
O sistema deverá ler e escrever dados em arquivos CSV para persistência dos dados:
○ Um arquivo para armazenar os dados dos leads.
○ Um arquivo para armazenar as informações do funil de vendas.
○ Ao iniciar a aplicação, o sistema deverá carregar os dados dos arquivos CSV
em memória e permitir a manipulação dos dados durante a execução.
    4. Menu de Opções
O sistema terá um menu interativo para facilitar a navegação:
○ 1. Cadastrar novo lead
○ 2. Consultar leads cadastrados
○ 3. Atualizar status do funil de vendas
○ 4. Consultar status de um lead
○ 5. Gerar relatório de leads (por etapa, temperatura, classificação)
○ 0. Sair
    5. Controle de Alterações
Após cada alteração nos dados, o sistema deverá reescrever os arquivos CSV,
garantindo que os dados sejam persistidos corretamente.
Requisitos Não Funcionais
    1. Execução em Console
○ O sistema será executado em uma interface de linha de comando (console),
com um menu de opções interativo.
    2. Persistência de Dados em CSV
○ Os dados de leads e o funil de vendas serão armazenados em arquivos CSV.
○ O sistema deverá carregar esses arquivos no início e gravar as alterações
sempre que um dado for alterado.
○ A primeira linha do arquivo deve conter os cabeçalhos das colunas.
○ Formato de arquivo CSV:
■ leads.csv: ID, Nome, Email, Telefone, Escolaridade, Profissão, Empresa,
Origem, DataHoraCadastro.
■ funiu.csv: ID do Lead, Etapa, Temperatura, Classificação, Score,
DataHoraUltimoContato, DescriçãoContato.
Funcionalidades
    1. Cadastrar Leads: O usuário poderá adicionar novos leads ao sistema, informando
todos os dados necessários. O sistema gerará automaticamente um ID para cada lead.
    2. Gerenciar Funil de Vendas: O usuário poderá atualizar o status de um lead no funil de
vendas (etapa, temperatura, classificação, score, etc.), podendo visualizar o progresso
e as informações de cada interação.
    3. Consultas e Relatórios: O sistema permitirá consultas para visualizar informações
sobre leads cadastrados e relatórios de status de vendas com base em filtros como
etapa, temperatura ou classificação.
    4. Persistência e Leitura de Arquivos CSV: O sistema lerá os arquivos CSV no início da
execução, permitindo que os dados sejam manipulados e salvos de volta nos arquivos
após cada modificação.
    5. Menu Interativo: O menu interativo facilitará a navegação entre as funcionalidades,
com opções claras e objetivas.
REF: https://rockcontent.com/br/blog/o-que-e-lead/