import React from 'react';
import '../Stylesheets/mystyle.css'; // Import the stylesheet

function CalculateScore(props) {
  const { Name, School, Total, Goal } = props;
  const averageScore = (Total / Goal) * 100;

  return (
    <div className="score-container">
      <h2>Student Score Details</h2>
      <p><strong>Name:</strong> {Name}</p>
      <p><strong>School:</strong> {School}</p>
      <p><strong>Total Score:</strong> {Total}</p>
      <p><strong>Goal Score:</strong> {Goal}</p>
      <p className="average-score"><strong>Average Score:</strong> {averageScore.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;