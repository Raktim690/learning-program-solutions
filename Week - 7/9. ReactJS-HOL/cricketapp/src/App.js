import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers, { OddPlayers, EvenPlayers} from './IndianPlayers';

function App() {
  const flag = true; 

  const oddPlayersData = {
    first: 'Sachin1',
    third: 'Virat3',
    fifth: 'Yuvraj5'
  };

  const evenPlayersData = {
    second: 'Dhoni2',
    fourth: 'Rohit4',
    sixth: 'Raina6'
  };

  return (
    <div className="App">
      {flag ? (
        <div>
          <ListofPlayers />
        </div>
      ) : (
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers {...oddPlayersData} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers {...evenPlayersData} />
          <hr />
          <IndianPlayers />
        </div>
      )}
    </div>
  );
}

export default App;