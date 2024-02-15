import {Review} from "./review";

/**
 * @author Jonathan Zhu
 */

export interface Product {
    id: number;
    name: string;
    price: number;
    category: string;
    quantity : number;
    description: string;
    image: string;
    reviews: Review[];
    quantitySold: number;
}