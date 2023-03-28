import * as React from 'react';
import { StyleSheet, Text, View, Button, ScrollView} from 'react-native';

import Forms from './forms';

export default function CadastrarPessoa({navigation}) {
  return (
    <View style={styles.container} >
     <Forms/>
    </View>
  );
}

const styles = StyleSheet.create({
  container:{
      flex:1,
      
  },
  
});