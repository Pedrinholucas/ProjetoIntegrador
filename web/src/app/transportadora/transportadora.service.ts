import { Injectable } from '@angular/core';
import { Transportadora } from '../classes/Transportadora';

@Injectable({
  providedIn: 'root'
})
export class TransportadoraService {
  transportadora: Transportadora;
  constructor() { }
}
