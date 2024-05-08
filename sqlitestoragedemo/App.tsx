/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, {useState} from 'react';
import {View, Text} from 'react-native';

const App = () => {
  const [text, setText] = useState('点击我改变文字');

  const handlePress = () => {
    setText('文字已经改变');
  };

  return (
    <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
      <Text onPress={handlePress}>{text}</Text>
    </View>
  );
};

export default App;
