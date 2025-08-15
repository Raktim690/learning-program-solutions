import React from 'react';
import CalculateScore from './Components/CalculateScore'; // Import the CalculateScore component
import './App.css'; // Keep the default App.css or remove if not needed

function App() {
  return (
    <div className="App">
      {/* Example usage of CalculateScore component */}
      <CalculateScore
        Name="Raktim Das"
        School="Rose Bank Edu-Care High School"
        Total={850}
        Goal={1000}
      />

      <CalculateScore
        Name="Sayan Roy"
        School="Delhi Public School"
        Total={720}
        Goal={900}
      />

      <CalculateScore
        Name="Raja Singh"
        School="St.Jude's High School"
        Total={950}
        Goal={980}
      />
    </div>
  );
}

export default App;