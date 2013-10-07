  System.out.println("Lengyel forma feldolgozasa!\nKerem adja meg a szamot:");
  Stack<Float> v = new Stack<Float>();
	while(in.hasNext()){
		String s = in.next();
		switch (s){
			case "+":
				Float f1 = v.pop();
				Float f2 = v.pop();
				v.push(f1 + f2);
     f = Float.parseFloat("" + v.pop()) + Float.parseFloat("" + v.pop());
     v.push(f);
     break;
    case "-":
     f = Float.parseFloat(o1 + v.pop()) - Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    case "*":
     f = Float.parseFloat(o1 + v.pop()) * Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    case "/":
     f = Float.parseFloat(o1 + v.pop()) / Float.parseFloat(o2 + v.pop());
     v.push(f);
     break;
    default:
     v.push(s);
   }
   //Nem fejezi be a beolvasast valamiert.
   o3 = "" + v.pop();
   v.push(o3);
   System.out.println("CIKLUSMAG VEGE! " + o3);
  }
