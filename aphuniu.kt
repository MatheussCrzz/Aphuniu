fun main(){}    
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
                CadastrarLead()
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
