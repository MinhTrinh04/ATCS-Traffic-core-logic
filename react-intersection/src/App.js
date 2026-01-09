import React from 'react';
import { RoadLane } from './components/RoadLane';
import './App.css';

function App() {
    return (
        <div className="App">
            <RoadLane direction="down" width={80} height={300} />
        </div>
    );
}

export default App;
