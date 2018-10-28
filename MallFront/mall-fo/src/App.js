import React, { Component } from 'react';
import MallTemplate from './components/MallTemplate';
import MallItemList from './components/MallItemList';
import Form from './components/Form';

class App extends Component {
  render() {
    return (
      <MallTemplate form={<Form />}>
        <MallItemList/>
      </MallTemplate>
    );
  }
}

export default App;
