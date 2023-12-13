import { Cliente } from "./Cliente";
import { Produto } from "./Produto";
import { Transportadora } from "./Transportadora";

export class Encomenda{
    id: number;
    endereco: string;
    formaPagamento: string;
    frete: number;
    valorTotal: number;
    dataAquisicao: string | Date;
    dataEntrega: string | Date;
    idCliente: number;
    idTransportadora: number;
    produtos: Produto[]
}