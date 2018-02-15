package Oving5;

public class Partner {

	String name;
	Partner partner;
	
	public Partner(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Partner getPartner() {
		return this.partner;
	}
	
	public void setPartner(Partner partner) {
		
		if(partner == this.partner) {
			return;
		}
			
			Partner oldPartner = this.partner;
			this.partner = partner;

			if(oldPartner != null && oldPartner.getPartner() == this) {
				oldPartner.setPartner(null);
			}
			if(this.partner != null) {
				this.partner.setPartner(this);
			}
			
			}
		
		
	
	
	public String toString() {
		return "Navnet på partner er" + this.getPartner(); 
	}
	
	
	public static void main(String[] args) {
		Partner p1 = new Partner("Per");
		Partner p2 = new Partner("Emma");
		p1.setPartner(p2);
	}
	
	
}
