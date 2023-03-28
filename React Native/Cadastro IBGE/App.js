import * as React from 'react';
import { CheckBox, Text, View, StyleSheet, Button } from 'react-native';
import Constants from 'expo-constants';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import HomeScreen from './src/pages/Home';
import CadastrarPessoa from './src/pages/Pessoa'; 
import CadastrarImovel from './src/pages/Imovel';

const Stack = createNativeStackNavigator();
export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={HomeScreen}  options={{ title: 'Estácio' }} />
        <Stack.Screen name="CadastrarPessoa" component={CadastrarPessoa} options={{ title: 'Cadastrar Pessoa'}} />
        <Stack.Screen name="CadastrarImovel" component={CadastrarImovel} options={{ title: 'Cadastrar Imovel'}} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}