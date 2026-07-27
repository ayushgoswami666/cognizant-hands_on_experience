import officeImage from "../images/office.jpg";

function App() {

  const offices = [

    {
      name: "DLF Cyber City",
      rent: 55000,
      address: "Gurugram, Haryana"
    },

    {
      name: "WeWork Prestige",
      rent: 75000,
      address: "Bengaluru, Karnataka"
    },

    {
      name: "SmartWorks",
      rent: 62000,
      address: "Hyderabad, Telangana"
    },

    {
      name: "Regus Business Centre",
      rent: 45000,
      address: "Noida, Uttar Pradesh"
    }

  ];

  return (

    <div style={{ padding: "20px", fontFamily: "Arial" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office"
        width="500"
        height="300"
      />

      <hr />

      {
        offices.map((office, index) => (

          <div key={index} style={{ marginBottom: "20px" }}>

            <h2>{office.name}</h2>

            <p>
              <strong>Address :</strong> {office.address}
            </p>

            <p
              style={{
                color:
                  office.rent < 60000 ? "red" : "green",
                fontWeight: "bold"
              }}
            >
              Rent : ₹ {office.rent}
            </p>

          </div>

        ))
      }

    </div>

  );
}

export default App;