import React, { Component } from 'react';
import MallItem from './MallItem';

class MallItemList extends Component {
  render() {
    const { todos, onToggle, onRemove } = this.props;

    return (
        <div>
            <MallItem text="안녕"/>
            <MallItem text="리액트"/>
            <MallItem text="반가워"/>
        </div>
    );
  }
}

export default MallItemList;