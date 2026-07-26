import CalculateScore from './Components/CalculatorScore';

function App() {
  return (
    <div>
      <CalculateScore
        name="Ayush Goswami"
        school="GLA University"
        total={450}
        goal={5}
      />
    </div>
  );
}

export default App;