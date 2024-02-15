import { Product } from "./product";

/**
 * @author Jonathan Zhu
 */

export interface Cart {
    id: number;
    username: string;
    items: Product[];
    
}