class Produto:
    def __init__(self, id_produto, nome):
        self.id_produto = id_produto
        self.nome = nome
    
class Item_Carrinho:
    def __init__(self, produto, qtd, valor_un):
        self.produto = produto
        self.qtd = qtd
        self.valor_un = valor_un
        
    def valor_total(self):
        return self.valor_un * self.qtd
        
class Carrinho_de_compras:
    def __init__(self):
        self.itens = []
    def adicionar_item(self,produto, qtd,valor_un):
        
        for item in self.itens:  
            if item.produto.id_produto == produto.id_produto:
                item.qtd += qtd
                
                if item.valor_un != valor_un:
                    item.valor_un = valor_un
                return
            
        self.itens.append(Item_Carrinho(produto, qtd, valor_un))
        
    def remover_produto(self, id_produto):
        self.itens = [item for item in self.itens if item.produto.id_produto != id_produto]

    def obter_valor_total(self):
        return sum(item.valor_total() for item in self.itens)

    def obter_produtos(self):
        return [(item.produto.nome, item.qtd, item.valor_un) for item in self.itens]