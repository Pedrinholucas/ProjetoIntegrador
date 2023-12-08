import { Cliente } from "./Cliente";
import { Transportadora } from "./Transportadora";

export class Encomenda{
    id: number;
    endereco: string;
    formaPagamento: string;
    frete: number;
    valorTotal: number;
    dataAquisicao: Date;
    dataEntrega: Date;
    cliente: Cliente;
    transportadora: Transportadora;
}