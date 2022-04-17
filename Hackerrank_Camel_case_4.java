String input = sc.nextLine();
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(input.split(";")));
        // inputList[0] = Split or Combine
        // inputList[1] = Method, Class or Variable
        // inputList[2] = Words to split or combine
        String name = inputList.get(2);
        if (inputList.get(0).equals("S")){
            switch(inputList.get(1)){
                case "V":
                    // Regular Expression
                    String regex = "([a-z])([A-Z]+)";
 
                    // Replacement string
                    String replacement = "$1 $2";
            
                    // Replace the given regex
                    // with replacement string
                    // and convert it to lower case.
                    name = name.replaceAll(regex, replacement).toLowerCase();
            
                    // return string
                    System.out.println(name);
                    break;
                
                case "C":
                    // Regular Expression
                    regex = "([a-z])([A-Z]+)";
 
                    // Replacement string
                    replacement = "$1 $2";
            
                    // Replace the given regex
                    // with replacement string
                    // and convert it to lower case.
                    name = name.replaceAll(regex, replacement).toLowerCase();
            
                    // return string
                    System.out.println(name);
                    break;
                case "M":
                    // Regular Expression
                    regex = "([a-z])([A-Z]+)|\\(\\)";
 
                    // Replacement string
                    replacement = "$1 $2";
            
                    // Replace the given regex
                    // with replacement string
                    // and convert it to lower case.
                    name = name.replaceAll(regex, replacement).toLowerCase();
            
                    // return string
                    System.out.println(name);
                    break;
            }
        } else {
            StringBuilder builder = new StringBuilder();
            switch(inputList.get(1)){
                case "V":
                    boolean shouldConvert = false;
                    for (int i=0; i<name.length();i++){
                        char letter = name.charAt(i);
                        if (letter == ' '){
                            shouldConvert = true;
                        } else if (shouldConvert){
                            builder.append(Character.toUpperCase(letter));
                            shouldConvert = false;
                        } else{
                            builder.append(Character.toLowerCase(letter));
                        }
                    }
            
                    // return string
                    System.out.println(builder);
                    break;
                
                case "C":
                    shouldConvert = true;
                    for (int i=0; i<name.length();i++){
                        char letter = name.charAt(i);
                        if (letter == ' '){
                            shouldConvert = true;
                        } else if (shouldConvert){
                            builder.append(Character.toUpperCase(letter));
                            shouldConvert = false;
                        } else{
                            builder.append(Character.toLowerCase(letter));
                        }
                    }
                    System.out.println(builder);
                    break;
                
                case "M":
                    shouldConvert = false;
                    for (int i=0; i<name.length();i++){
                        char letter = name.charAt(i);
                        if (letter == ' '){
                            shouldConvert = true;
                        } else if (shouldConvert){
                            builder.append(Character.toUpperCase(letter));
                            shouldConvert = false;
                        } else{
                            builder.append(Character.toLowerCase(letter));
                        }
                    }
                    builder.append("()");
            
                    // return string
                    System.out.println(builder);
                    break;
            }
                
        }
    }
