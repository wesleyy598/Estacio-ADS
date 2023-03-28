import  React from 'react';
import { StyleSheet, Text, TextInput, View, Button, ScrollView, TouchableOpacity, Alert, Image} from 'react-native';

export default function Title() {

 

  return (
    <View style={styles.container}>
        <Image
        style={styles.image}
        source={{
          uri: 'https://logodownload.org/wp-content/uploads/2014/12/estacio-logo-1.png',
        }}
      />
    </View>
  );

}
const styles = StyleSheet.create({
  container:{
    flex:1,
    alignItems: "center",
    
  },
  image:{
    width: 100,
    height:100
  }
});
