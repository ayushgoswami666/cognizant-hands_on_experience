import React from "react";
import Cart from "./Cart";

class OnlineShopping extends React.Component {

    constructor(props) {

        super(props);

        this.items = [

            { itemname: "Laptop", price: 65000 },

            { itemname: "Mouse", price: 700 },

            { itemname: "Keyboard", price: 1500 },

            { itemname: "Monitor", price: 12000 },

            { itemname: "Headphones", price: 2500 }

        ];

    }

    render() {

        return (

            <div>

                <h1>Online Shopping Cart</h1>

                <table border="1" cellPadding="10">

                    <thead>

                        <tr>

                            <th>Item Name</th>

                            <th>Price</th>

                        </tr>

                    </thead>

                    <tbody>

                        {

                            this.items.map((item, index) => (

                                <Cart

                                    key={index}

                                    itemname={item.itemname}

                                    price={item.price}

                                />

                            ))

                        }

                    </tbody>

                </table>

            </div>

        );

    }

}

export default OnlineShopping;