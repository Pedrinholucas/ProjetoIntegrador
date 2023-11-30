import { Encomenda } from "./Encomenda";
import { Produto } from "./Produto";

export class Reconhecimento{
    id: number;
    quantidade: number;
    produto: Produto;
    encomenda: Encomenda;
}