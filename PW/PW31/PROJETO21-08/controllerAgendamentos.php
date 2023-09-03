<?php

    class ControllerAgendamentos{
        private $cadastro;

        public function _construct(){
            $this->cadastro=new Agendamentos();
            $this->incluir();
        }

        private function incluir(){
            $this->agendamentos->setNome($_POST['txtNome']);
            $this->agendamentos->setNome($_POST['txtTelefone']);
            $this->agendamentos->setNome($_POST['txtOrigem']);
            $this->agendamentos->setNome($_POST['txtData_contato']);
            $this->agendamentos->setNome($_POST['txtObservacao']);




        }
    }