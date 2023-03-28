import * as React from 'react';
import { CheckBox, Text, View, StyleSheet, Button } from 'react-native';
import Constants from 'expo-constants';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import Home from './source/pages/Home/index';
import CadastrarUniversidade from './source/pages/CadastroUniversidade/CadastroUniversidade';


const Stack = createNativeStackNavigator();
export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={Home}  options={{ title: 'Estácio' }} />
        <Stack.Screen name="CadastrarUniversidade" component={CadastrarUniversidade} options={{ title: 'Cadastrar Universidade'}} />
        
      </Stack.Navigator>
    </NavigationContainer>
  );
}