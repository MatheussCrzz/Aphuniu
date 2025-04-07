    def mostrarMenu():
        while True:
            print("===== Aphuniu =====")
            print("1. Cadastrar novo lead")
            print("2. Consultar leads cadastrados")
            print("3. Atualizar status do funil de vendas")
            print("4. Consultar status de um lead")
            print("5. Gerar relatório de leads (por etapa, temperatura, classificação)")
            print("0. Sair")
            print("================")

            opcao = input("Opção: ")

            if opcao == '1':
                CadastrarLead():
                    val id = leads.size + 1
                    print("Digite o nome: ")
                    val nome = readLine() ?: ""
                        
                    print("Digite o e-mail: ")
                    val email = readLine() ?: ""
                        
                    print("Digite o telefone: ")
                    val telefone = readLine() ?: ""

                    print("Digite a escolaridade: ")
                    val escolaridade = readLine() ?: ""

                    print("Digite a profissão: ")
                    val profissao = readLine() ?: ""

                    print("Digite a Empresa: ")
                    val empresa = readLine() ?: ""

                    print("Digite a origem do lead: ")
                    val origem = readLine() ?: ""

                    print("Digite a data e hora do cadastro: ")
                    val dt/hr = readLine() ?: ""

                    val lead = Lead(id, nome, email, telefone, escolaridade, profissao, empresa, origem, dt/hr)
                        
                    gravarLead(lead)

            fun gravarLead(lead: Lead) {

                leads.add(lead)

                val csvData = buildString {
                
                    if (leads.indexOf(lead) == 0) {
                        appendLine("ID,Nome,Email,Telefone")
                    }
                
                leads.forEach { l ->
                    appendLine("${l.id},${l.nome},${l.email},${l.telefone},${escolaridade},${profissao},${empresa},${origem},${dt/hr}")
                }
            }

            elif opcao == '2':
                ConsultarLead()  
            elif opcao == '3':
                AtualizarStatusFunil()
            elif opcao == '4':
                ConsultarStatusLead()
            elif opcao == '5':
                GerarRelatório()      
            elif opcao == '0':
                print("Saindo do programa...")
                break  
            else:
                print("Opção inválida! Tente novamente.")

    def main():
        mostrarMenu()

    def CadastrarLead():
        print("Função da opção 1")

    def ConsultarLead():
        print("Função da opção 2")

    def AtualizarStatusFunil():
        print("Função da opção 3")
    def AtualizarStatusFunil():

    def GerarRelatório():

    if __name__ == "__main__":
        main()
