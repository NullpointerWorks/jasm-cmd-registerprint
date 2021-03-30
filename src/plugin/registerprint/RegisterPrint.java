package plugin.registerprint;

import static com.nullpointerworks.jasm.vm.VMRegister.*;

import com.nullpointerworks.cmd.jasm.exe.plugin.VMPlugin;
import com.nullpointerworks.jasm.vm.Register;
import com.nullpointerworks.jasm.vm.VirtualMachine;

public class RegisterPrint extends VMPlugin
{
	@Override
	public void onInterrupt(VirtualMachine vm, int code) 
	{
		/*
		 * special registers
		 */
		if (code == 1)
		{
			Register reg = vm.getRegister( REG_A );
			System.out.println( "A: "+reg.getValue() );
			return;
		}
		
		if (code == 2)
		{
			Register reg = vm.getRegister( REG_B );
			System.out.println( "B: "+reg.getValue() );
			return;
		}
		
		if (code == 3)
		{
			Register reg = vm.getRegister( REG_C );
			System.out.println( "C: "+reg.getValue() );
			return;
		}
		
		if (code == 4)
		{
			Register reg = vm.getRegister( REG_D );
			System.out.println( "D: "+reg.getValue() );
			return;
		}
		
		/*
		 * system registers
		 */
		if (code == 5)
		{
			Register reg = vm.getRegister( REG_IP );
			System.out.println( "IP: "+reg.getValue() );
			return;
		}
		
		if (code == 6)
		{
			Register reg = vm.getRegister( REG_SP );
			System.out.println( "SP: "+reg.getValue() );
			return;
		}
		
		/*
		 * general purpose registers
		 */
		if (code == 7)
		{
			Register reg = vm.getRegister( REG_0 );
			System.out.println( "R0: "+reg.getValue() );
			return;
		}
		if (code == 8)
		{
			Register reg = vm.getRegister( REG_1 );
			System.out.println( "R1: "+reg.getValue() );
			return;
		}
		if (code == 9)
		{
			Register reg = vm.getRegister( REG_2 );
			System.out.println( "R2: "+reg.getValue() );
			return;
		}
		if (code == 10)
		{
			Register reg = vm.getRegister( REG_3 );
			System.out.println( "R3: "+reg.getValue() );
			return;
		}
		if (code == 11)
		{
			Register reg = vm.getRegister( REG_4 );
			System.out.println( "R4: "+reg.getValue() );
			return;
		}
		if (code == 12)
		{
			Register reg = vm.getRegister( REG_5 );
			System.out.println( "R5: "+reg.getValue() );
			return;
		}
		if (code == 13)
		{
			Register reg = vm.getRegister( REG_6 );
			System.out.println( "R6: "+reg.getValue() );
			return;
		}
		if (code == 14)
		{
			Register reg = vm.getRegister( REG_7 );
			System.out.println( "R7: "+reg.getValue() );
			return;
		}
		if (code == 15)
		{
			Register reg = vm.getRegister( REG_8 );
			System.out.println( "R8: "+reg.getValue() );
			return;
		}
		if (code == 16)
		{
			Register reg = vm.getRegister( REG_9 );
			System.out.println( "R9: "+reg.getValue() );
			return;
		}
	}
}
