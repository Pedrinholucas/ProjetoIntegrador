import { Categoria } from "./Categoria";
import { Fornecedor } from "./Fornecedor";

export class Produto{
    id: number;
    nome: string;
    valor: number;
    descricao: string;
    estoque: number;
    avaliacao: number;
    detalhesGarantia: string;
    fornecedor: Fornecedor;
    categoria: Categoria;
}