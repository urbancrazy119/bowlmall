import React from 'react';
import '../css/MallTemplate.css';

// 함수형 컴포넌트
// 비구조화 할당
const MallTemplate = ({form, children}) => {
  return (
    <main className="todo-list-template">
      <div className="title">
        볼링 쇼핑몰
      </div>
      <section className="form-wrapper">
        {form}
      </section>
      <section className="todos-wrapper">
        { children }
      </section>
    </main>
  );
};

export default MallTemplate;