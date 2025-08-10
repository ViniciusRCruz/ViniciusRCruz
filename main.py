from produto import Produto, Carrinho_de_compras

def main():
    carrinho = Carrinho_de_compras()
    produtos_catalogo = {}

    while True:
        print("\n--- MENU ---")
        print("1. Adicionar Produto ao Catálogo")
        print("2. Adicionar Item ao Carrinho")
        print("3. Remover Produto do Carrinho")
        print("4. Ver Carrinho")
        print("5. Finalizar e Ver Valor Total")
        print("0. Sair")

        opcao = input("Escolha uma opção: ")

        if opcao == '1':
            id_produto = int(input("ID do Produto: "))
            nome = input("Nome do Produto: ")
            produto = Produto(id_produto, nome)
            produtos_catalogo[id_produto] = produto
            print(f"Produto '{nome}' adicionado ao catálogo.")

        elif opcao == '2':
            id_produto = int(input("ID do Produto: "))
            if id_produto in produtos_catalogo:
                qtd = int(input("Quantidade: "))
                valor_un = float(input("Valor Unitário: R$ "))
                carrinho.adicionar_item(produtos_catalogo[id_produto], qtd, valor_un)
                print("Item adicionado ao carrinho!")
            else:
                print("Produto não encontrado no catálogo. Adicione ao catálogo primeiro.")

        elif opcao == '3':
            id_produto = int(input("ID do Produto para Remover: "))
            carrinho.remover_produto(id_produto)
            print("Produto removido do carrinho.")

        elif opcao == '4':
            print("\n--- Carrinho de Compras ---")
            for nome, qtd, valor_un in carrinho.obter_produtos():
                print(f"{nome} | Quantidade: {qtd} | Valor Unitário: R$ {valor_un}")
            print(f"Valor Total : R$ {carrinho.obter_valor_total()}")

        elif opcao == '5':
            print("\n--- Finalização da Compra ---")
            for nome, qtd, valor_un in carrinho.obter_produtos():
                print(f"{nome} | Quantidade: {qtd} | Valor Unitário: R$ {valor_un}")
            print(f"Valor Total Final: R$ {carrinho.obter_valor_total()}")
            break  

        elif opcao == '0':
            print("Encerrando programa...")
            break

        else:
            print("Opção inválida!")

if __name__ == "__main__":
    main()
