const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const CleanWebpackPlugin = require('clean-webpack-plugin');

module.exports = {
        mode: 'development',
        entry: {
            app: './src/webapp/**',
            print: './src/print.js'
        },
       devtool: 'inline-source-map',
    watch: true,
    watchOptions: {
        poll: 1000 // Check for changes every second
    },
    plugins: [
    new CleanWebpackPlugin(['dist']),
    new HtmlWebpackPlugin({
        title: 'Development'
    })
],
    output: {
    filename: '[name].bundle.js',
        path: path.resolve(__dirname, 'dist')
}
};