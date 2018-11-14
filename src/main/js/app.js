'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const when = require('when');

const root = '/api';

class App extends React.Component {

    render() {
        return (
            <div>
                Hello World!
            </div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)
