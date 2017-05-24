package cr.taller.ejercicio2.equipo4;

public class CPU {

    public static boolean MASK_FLAG_ZERO = false;

    public void executeOpCode(OpCode opCode, boolean flags) {
        CodeAddress programCounter;
        if (opCode.getInstruction() == Instruction.NO_OPERATION) {
            Clock.tick();
        } else if (opCode.getInstruction().equals(Instruction.IF_ZERO_FLAG_GOTO_ADDRESS)) {
            if (flags & MASK_FLAG_ZERO) {
                CodeAddress codeAddress = (CodeAddress) opCode.getParam1();
                programCounter = codeAddress;

                Clock.tick();
                Clock.tick();

            } else {
                Clock.tick();
            }

        } else if (opCode.getInstruction().equals(Instruction.LOAD_FROM_RAM_TO_REG)) {
            Register reg = (Register) opCode.getParam1();
            RAMAddress address = (RAMAddress) opCode.getParam2();

            byte data = new RAM().getInstance().get(address);

            reg.setData(data);

            Clock.tick();
            Clock.tick();
        } else if (opCode.getInstruction().equals(Instruction.SAVE_REG_TO_RAM)) {
            Register reg = (Register) opCode.getParam1();
            RAMAddress address = opCode.getParam2();

            byte data = reg.getData();

            new RAM().getInstance().set(address, data);

            Clock.tick();
            Clock.tick();
            Clock.tick();
        }
    }


    //FIXME: De aca para abajo son objetos MOCK, no tomarlos en cuenta para la evauluacion de el ejercicio

    private enum Instruction {
        NO_OPERATION, IF_ZERO_FLAG_GOTO_ADDRESS, LOAD_FROM_RAM_TO_REG, SAVE_REG_TO_RAM
    }

    private static class Clock {
        private static int TICK = 0;

        private static void tick() {
            TICK++;
        }
    }

    private class RAM {
        private void set(Object object, Object object2) {
        }

        private byte get(Object object) {
            return 0;
        }

        private RAM getInstance() {
            return this;
        }
    }

    private class OpCode {
        private Instruction getInstruction() {
            return Instruction.NO_OPERATION;
        }

        private Object getParam1() {
            return null;
        }

        private RAMAddress getParam2() {
            return null;
        }

    }

    private class CodeAddress {

    }

    private class Register {
        private void setData(Object object) {
        }

        private byte getData() {
            return 0;
        }
    }

    private class RAMAddress {

    }

}
