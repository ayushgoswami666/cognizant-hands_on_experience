function ListofPlayers() {

    const players = [

        { name: "Virat Kohli", score: 90 },
        { name: "Rohit Sharma", score: 45 },
        { name: "Shubman Gill", score: 78 },
        { name: "KL Rahul", score: 65 },
        { name: "Hardik Pandya", score: 88 },
        { name: "Ravindra Jadeja", score: 55 },
        { name: "R Ashwin", score: 71 },
        { name: "Mohammed Shami", score: 20 },
        { name: "Jasprit Bumrah", score: 10 },
        { name: "Mohammed Siraj", score: 32 },
        { name: "Kuldeep Yadav", score: 75 }

    ];

    return (

        <div>

            <h2>List of Players</h2>

            <ul>

                {
                    players.map((player, index) => (

                        <li key={index}>
                            {player.name} - {player.score}
                        </li>

                    ))
                }

            </ul>

            <h2>Players with Score Below 70</h2>

            <ul>

                {
                    players
                        .filter(player => player.score < 70)
                        .map((player, index) => (

                            <li key={index}>
                                {player.name} - {player.score}
                            </li>

                        ))
                }

            </ul>

        </div>

    );

}

export default ListofPlayers;